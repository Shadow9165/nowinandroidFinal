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

package com.google.samples.apps.nowinandroid.ui.homeworks.homework17.extentions

import com.google.samples.apps.nowinandroid.ui.homeworks.homework17.tools.ActionsSteps
import com.google.samples.apps.nowinandroid.ui.homeworks.homework17.tools.CheckSteps
import com.google.samples.apps.nowinandroid.ui.homeworks.homework17.StepsDSL
import com.google.samples.apps.nowinandroid.ui.homeworks.homework17.tools.StepsExecutor
import com.kaspersky.kaspresso.testcases.core.testcontext.TestContext

private val executorHasMap = mutableMapOf<String, StepsDSL<*>>()

val TestContext<*>.action: ActionsSteps
    get() {
        val key = ActionsSteps::class.java.name + this.hashCode()
        return executorHasMap.getOrPut(key) {
            ActionsSteps(StepsExecutor(this))
        } as ActionsSteps
    }

val TestContext<*>.checks: CheckSteps
    get() {
        val key = CheckSteps::class.java.name + this.hashCode()
        return executorHasMap.getOrDefault(key) {
            CheckSteps(StepsExecutor(this))
        } as CheckSteps
    }