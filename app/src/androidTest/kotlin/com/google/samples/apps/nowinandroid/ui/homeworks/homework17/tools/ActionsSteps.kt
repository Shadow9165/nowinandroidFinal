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

package com.google.samples.apps.nowinandroid.ui.homeworks.homework17.tools

import com.google.samples.apps.nowinandroid.ui.homeworks.homework17.StepsDSL
import com.google.samples.apps.nowinandroid.ui.homeworks.homework17.extentions.name
import io.github.kakaocup.compose.node.action.NodeActions
import java.util.concurrent.atomic.AtomicReference

class ActionsSteps(private val stepsExecutor: StepsExecutor): StepsDSL<ActionsSteps>() {
    override val self = this

    fun click(item: NodeActions) {
        stepsExecutor.click("Нажимает на кнопку ${item.name()}", item)
    }

    fun nextStep(step: String) {
        stepsExecutor.setNextStepName(step  )
    }

    fun <T> extract(
        item: NodeActions,
        container: AtomicReference<T>,
        extraction: (item: NodeActions) -> T
    ) {
        stepsExecutor.extractSemantics(
            "Получает данные из элемента ${item.name()}",
            item,
            container,
            extraction
        )
    }
}