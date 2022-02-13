/**
 * 
 */
package structural.composite;

/**
 * @author utkarsh
 *
 */
public interface Member {

	boolean addMember(Member m);
	boolean removeMember(Member m);
	void printChildren();
	String getParents();
}
