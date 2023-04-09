
public class todo_list {

	public static void main(String[] args) {
		
		//görevlerin boolean tanımları
		
		boolean brush_teethbl,code_smthbl,go_gymbl,work_otherbl;
		
		final boolean forgot_herbl = false;
		
		//görev tanımları declare
		
		String brush_teeth,code_smth,go_gym,work_other,forgot_her;
		
		// görev tanımlarının assignları
		brush_teeth = "Have you brushed your teeth? : ";
		code_smth = "Have you practiced coding? : ";
		go_gym = "Have you went to gym? : ";
		work_other = "Have you worked other things? : ";
		forgot_her = "Haven't you forgot her? : ";
		
		//görevlerin boolean değerleri
		
		brush_teethbl = true;
		code_smthbl = true;
		go_gymbl = false;
		work_otherbl = false;
		
		//çıktılar
		
		
		System.out.println(brush_teeth + brush_teethbl );
		System.out.println(code_smth + code_smthbl);
		System.out.println(go_gym + go_gymbl);
		System.out.println(work_other + work_otherbl);
		System.out.println("");
		System.out.println("");
		System.out.println(forgot_her + forgot_herbl);
		
		
		
		// TODO Auto-generated method stub

	}

}
