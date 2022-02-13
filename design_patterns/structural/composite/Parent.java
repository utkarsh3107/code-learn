package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Parent implements Member{

	private String mother;
	private String father;
	private String name;
	
	List<Member> tree = new ArrayList<>(); 
	
	public Parent(String name, String mother, String father){
		this.name = name;
		this.mother = mother;
		this.father = father;
	}
	
	@Override
	public boolean addMember(Member m) {
		return tree.add(m);
	}

	@Override
	public boolean removeMember(Member m) {
		// TODO Auto-generated method stub
		return tree.remove(m);
	}

	@Override
	public void printChildren() {
		for(Member each : tree){
			System.out.println("---------------------");
			System.out.println(each.getParents());
			System.out.println("---------------------");
		}
		
	}

	@Override
	public String getParents() {
		printChildren();
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ");
		sb.append(name);
		sb.append("\n");
		sb.append("Father: ");
		sb.append(father);
		sb.append("\n");
		sb.append("Mother: ");
		sb.append(mother);
		return sb.toString();
	}
	

}
