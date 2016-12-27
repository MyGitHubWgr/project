package com.xinqi.web.init;

import com.jfinal.config.*;

/**
 * Created by dell on 2016/8/25.
 */
public class Config extends JFinalConfig {
    @Override
    public void configConstant(Constants constants) {
        ConfigConstatants.config(constants);
    }

    @Override
    public void configRoute(Routes routes) {
        ConfigRoutes.config(routes);
    }

    @Override
    public void configPlugin(Plugins plugins) {
        ConfigPlugin.config(plugins);
    }

    @Override
    public void configInterceptor(Interceptors interceptors) {
        ConfigInterceptor.config(interceptors);
    }

    @Override
    public void configHandler(Handlers handlers) {
        ConfigHandler.config(handlers);
    }
}
