package org.wso2.carbon.identity.authenticator.office365.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.identity.application.authentication.framework.ApplicationAuthenticator;
import org.wso2.carbon.identity.authenticator.office365.Office365Authenticator;

import java.util.Hashtable;

/**
 * @scr.component name="identity.application.authenticator.office365.component" immediate="true"
 */
public class Office365AuthenticatorServiceComponent {

    private static Log log = LogFactory.getLog(Office365AuthenticatorServiceComponent.class);

    protected void activate(ComponentContext ctxt) {
        try {
            Office365Authenticator authenticator = new Office365Authenticator();
            Hashtable<String, String> props = new Hashtable<String, String>();
            ctxt.getBundleContext().registerService(ApplicationAuthenticator.class.getName(),
                    authenticator, props);
            if (log.isDebugEnabled()) {
                log.debug("office365 authenticator is activated");
            }
        } catch (Throwable e) {
            log.fatal("Error while activating the office365 authenticator ", e);
        }
    }

    protected void deactivate(ComponentContext ctxt) {
        if (log.isDebugEnabled()) {
            log.debug("office365 authenticator is deactivated");
        }
    }
}
