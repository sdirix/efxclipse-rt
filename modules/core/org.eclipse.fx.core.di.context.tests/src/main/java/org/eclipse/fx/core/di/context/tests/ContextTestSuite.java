package org.eclipse.fx.core.di.context.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AdaptSupplierTestCase.class,ContextBoundValueTestCase.class, PreferenceValueTestCase.class,ServiceSupplierTestCase.class,LocalInstanceTestCase.class})
public class ContextTestSuite {

}
