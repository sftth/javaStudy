package javaStudy.test2017.note;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
	private static void test(Item item) {
		Manager manager = item.getManager();
		
		List<Menu> children = getMenuItems(item.getManager().getId(), item.getName());
		
		for(Menu child: children) {
			deleteMenuItem(child);
		}
	}
	
	private static List<Menu> getMenuItems(int managerId, String name) {
		List<Menu> menuList = new ArrayList<Menu> ();
		
		return menuList;
	}
	
	private static void deleteMenuItem(Menu child) {
		
	}
	
	public static void main(String[] args) {
		Item item = new Item();
		Manager manager = new Manager();
		item.setManager(manager);
		Q6.test(item);
	}
}

class Item {
	Manager manager;
	String name;
	
	public Manager getManager() {
		return this.manager;
	}
	
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	public String getName() {
		return this.name;
	}
}

class Manager {
	int id;
	
	public int getId() {
		return id;
	}
}

class Menu {
	
}