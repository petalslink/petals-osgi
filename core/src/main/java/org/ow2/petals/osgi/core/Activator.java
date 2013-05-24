package org.ow2.petals.osgi.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * chamerling - chamerling@linagora.com
 */
public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Starting the CORE bundle");
        // ...
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping the CORE bundle");
        //...
    }
}
