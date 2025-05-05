/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.ui.homeworks.homework17

import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.LazyListItemPositionSemantics
import com.google.samples.apps.nowinandroid.core.designsystem.LazyListLengthSemantics
import com.google.samples.apps.nowinandroid.core.designsystem.TestingTag
import com.google.samples.apps.nowinandroid.ui.homeworks.homework16.items.ForYouNewsFeedItem
import com.google.samples.apps.nowinandroid.ui.homeworks.homework16.items.ForYouOnboardingItem
import com.google.samples.apps.nowinandroid.ui.homeworks.homework16.node.NavBarNode
import com.google.samples.apps.nowinandroid.ui.homeworks.homework16.node.TopAppBarNode
import io.github.kakaocup.compose.node.element.lazylist.KLazyListNode
import com.google.samples.apps.nowinandroid.ui.homeworks.homework17.extentions.name
import com.google.samples.apps.nowinandroid.ui.homeworks.homework17.extentions.invokeChildAtIndex

class NamedForYouScreen(
    semanticsProvider: SemanticsNodeInteractionsProvider? = null,
): NamedComposeScreen<NamedForYouScreen>(semanticsProvider) {
    override val screenName: String = "NamedForYoyScreen"


    val topAppBarNode by lazy {
        child<TopAppBarNode> {
            hasTestTag(TestingTag.TOP_APP_BAR)
        }.name(withParent("Top App Bar"))
    }


    val grid by lazy {
        KLazyListNode(
            semanticsProvider = semanticsProvider,
            viewBuilderAction = { hasTestTag("forYou:feed") },
            itemTypeBuilder = {
                itemType(::ForYouOnboardingItem)
                itemType(::ForYouNewsFeedItem)
            },
            positionMatcher = { position ->
                SemanticsMatcher.expectValue(
                    LazyListItemPositionSemantics,
                    position,
                )
            },
            lengthSemanticsPropertyKey = LazyListLengthSemantics,
        ).name(withParent("Feed"))
    }

    val navBarNode by lazy {
        child<NavBarNode> {
            hasTestTag(TestingTag.NAV_BAR)
        }.name(withParent("Nav Bar Node"))
    }

    fun forYouNewsFeedNode(index: Int, function: ForYouNewsFeedItem.() -> Unit) {
        grid.invokeChildAtIndex(index, function)
    }
}