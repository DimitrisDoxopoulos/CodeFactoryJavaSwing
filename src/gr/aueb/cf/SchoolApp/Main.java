package gr.aueb.cf.SchoolApp;

import java.awt.EventQueue;

public class Main {
	private static Menu menu;
	private static SearchForm searchForm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu = new Menu();
					menu.setVisible(true);
					
					searchForm = new SearchForm();
					searchForm.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static Menu getMenu() {
		return menu;
	}
	
	public static void setMenu(Menu menu) {
		Main.menu = menu;
	}
	
	public static SearchForm getSearchForm() {
		return searchForm;
	}
	
	public static void setSearchForm(SearchForm searchForm) {
		Main.searchForm = searchForm;
	}
	
}
