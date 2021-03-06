package org.osgi.service.component.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The annotated method is the modified method of the Component. This annotation is not processed at runtime by a
 * Service Component Runtime implementation. It must be processed by tools and used to add a Component Description to
 * the bundle.
 * 
 * @since Release 4 Early Draft 2011.09
 * 
 */
@Retention(value = RetentionPolicy.CLASS)
@Target(value = ElementType.METHOD)
public @interface Modified {

}
