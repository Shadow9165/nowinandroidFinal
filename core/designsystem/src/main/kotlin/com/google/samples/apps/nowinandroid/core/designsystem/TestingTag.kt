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

package com.google.samples.apps.nowinandroid.core.designsystem

import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.semantics.SemanticsPropertyReceiver

object TestingTag {

    const val SEARCH_BUTTON_TOP_APP_BAR = "searchButtonTopAppBar"
    const val TITLE_TEXT_TOP_APP_BAR = "titleTextTopAppbar"
    const val SETTINGS_BUTTON_TOP_APP_BAR = "settingsButtonTopAppBar"


    const val BACK_BUTTON_SEARCH_TOOL_BAR = "backButtonSearchToolBar"
    const val SEARCH_TEXT_FIELD = "searchTextField"
    const val CLEAR_BUTTON_SEARCH_TOOL_BAR = "clearButtonSearchToolBar"

    const val TOP_APP_BAR = "niaTopAppBar"
    const val NAV_BAR = "NiaNavItem"

    const val TITLE_TOPIC_TEXT = "titleTopicText"
    const val SUB_TITLE_TOPIC_TEXT = "subTitleTopicText"
    const val DONE_BUTTON_TOPIC = "doneButton"


    const val NEWS_TITLE = "newsTitle"
    const val NEWS_IMAGE = "newsImage"

    const val TEXT_SINGLE_TOPIC = "textSingleTopic"
    const val BUTTON_SINGLE_TOPIC = "buttonSingleTopic"
    const val ICON_SINGLE_TOPIC = "iconSingleTopic"
}


val LazyListItemPositionSemantics = SemanticsPropertyKey<Int>("LazyListItemPosition")
var SemanticsPropertyReceiver.lazyListItemPosition by LazyListItemPositionSemantics

val LazyListLengthSemantics = SemanticsPropertyKey<Int>("LazyListLength")
var SemanticsPropertyReceiver.lazyListLength by LazyListLengthSemantics