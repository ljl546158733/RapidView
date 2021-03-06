/***************************************************************************************************
 Tencent is pleased to support the open source community by making RapidView available.
 Copyright (C) 2017 THL A29 Limited, a Tencent company. All rights reserved.
 Licensed under the MITLicense (the "License"); you may not use this file except in compliance
 withthe License. You mayobtain a copy of the License at

 http://opensource.org/licenses/MIT

 Unless required by applicable law or agreed to in writing, software distributed under the License is
 distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 implied. See the License for the specific language governing permissions and limitations under the
 License.
 ***************************************************************************************************/
package com.tencent.rapidview.deobfuscated.control;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * @Class IItemDecorationListener
 * @Desc 给Lua代理的ItemDecoration接口
 *
 * @author arlozhang
 * @date 2017.09.20
 */
public interface IItemDecorationListener {

    void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state);

    void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state);

    void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state);
}
