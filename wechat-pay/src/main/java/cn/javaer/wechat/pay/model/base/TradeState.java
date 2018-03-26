/*
 * Copyright (c) 2018 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.javaer.wechat.pay.model.base;

/**
 * 交易状态.
 *
 * @author zhangpeng
 */
public enum TradeState {

    /**
     * 支付成功.
     */
    SUCCESS,

    /**
     * 转入退款.
     */
    REFUND,

    /**
     * 未支付.
     */
    NOTPAY,

    /**
     * 已关闭.
     */
    CLOSED,

    /**
     * 已撤销(刷卡支付).
     */
    REVOKED,

    /**
     * 用户支付中.
     */
    USERPAYING,

    /**
     * 支付失败(其他原因，如银行返回失败).
     */
    PAYERROR
}
