/**
 * 
 */
package structural.decorator;

/**
 * @author utkarsh
 *
 */
public class SimpleIceCream implements IceCream {

	/* (non-Javadoc)
	 * @see designpatterns.structural.decorator.IceCream#makeIceCream()
	 */
	@Override
	public String makeIceCream() {
		return "Basic Icecream";
	}

}
