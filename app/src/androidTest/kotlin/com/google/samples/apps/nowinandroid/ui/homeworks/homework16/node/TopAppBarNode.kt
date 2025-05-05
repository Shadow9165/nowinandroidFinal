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

package com.google.samples.apps.nowinandroid.ui.homeworks.homework16.node

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import com.google.samples.apps.nowinandroid.core.designsystem.TestingTag
import io.github.kakaocup.compose.node.builder.NodeMatcher
import io.github.kakaocup.compose.node.core.BaseNode
import io.github.kakaocup.compose.node.element.KNode

class TopAppBarNode(
    semanticsProvider: SemanticsNodeInteractionsProvider?,
    nodeMatcher: NodeMatcher,
    parentNode: BaseNode<*>? = null,
) : BaseNode<TopAppBarNode>(semanticsProvider, nodeMatcher, parentNode) {

    val searchButtonTopAppBar = child<KNode> {
        hasTestTag(TestingTag.SEARCH_BUTTON_TOP_APP_BAR)
    }

    val titleTextTopAppBar = child<KNode> {
        hasTestTag(TestingTag.TITLE_TEXT_TOP_APP_BAR)
    }

    val settingsButtonTopAppBar = child<KNode> {
        hasTestTag(TestingTag.SETTINGS_BUTTON_TOP_APP_BAR)
    }
}