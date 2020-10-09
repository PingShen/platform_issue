package com.taobao.idlefish.flutterboostexample;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class TextPlatformViewFactory extends PlatformViewFactory {

    public TextPlatformViewFactory(MessageCodec<Object> createArgsCodec) {
        super(createArgsCodec);
    }

    @Override
    public PlatformView create(Context context, int i, Object o) {
        return new TextPlatformView(context);
    }

    private static class TextPlatformView implements PlatformView {

        private GestureDemoView demoView;

        public TextPlatformView(Context context) {
            demoView = new GestureDemoView(context);
        }

        @Override
        public View getView() {
            return demoView;
        }

        @Override
        public void dispose() {

        }
    }
}
