package objectExercise;

public class Property {
	private String name;
	private String owner;
	private String type;
	private String prise;
	private String plan;
	private String area;

	Property (String name, String owner, String type, String prise, String plan, String area) {
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.prise = prise;
		this.plan = plan;
		this.area = area;
	}

	public void greeting() {
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者名：" + this.owner);
		System.out.println("物件種別：" + this.type);
		System.out.println("物件価格：" + this.prise);
		System.out.println(this.plan + "：" + this.area);
	}
	
	public static void set() {
		
	}
	public static void get() {
		
	}
}
