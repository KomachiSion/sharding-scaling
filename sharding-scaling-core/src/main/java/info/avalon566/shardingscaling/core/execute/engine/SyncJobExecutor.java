/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package info.avalon566.shardingscaling.core.execute.engine;

import info.avalon566.shardingscaling.core.config.SyncConfiguration;
import info.avalon566.shardingscaling.core.controller.ReportCallback;
import info.avalon566.shardingscaling.core.controller.SyncTaskProgress;
import info.avalon566.shardingscaling.core.execute.Reporter;

import java.util.List;

/**
 * Sync job executor, run in in process, k8s etc.
 *
 * @author avalon566
 */
public interface SyncJobExecutor {

    /**
     * start execute jobs.
     *
     * @param configs job configs
     * @param reportCallback report callback
     * @return reporter
     */
    Reporter start(List<SyncConfiguration> configs, ReportCallback reportCallback);

    /**
     * stop all execute jobs.
     */
    void stop();

    /**
     * get all execute job migrate progresses.
     *
     * @return list of migrate progresses
     */
    List<SyncTaskProgress> getProgresses();
}
