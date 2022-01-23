package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1.���� ȣ�� ������ ���α׷����� ���
@Controller
public class Hello {
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; //static����
	
	//2.URL�� �޼��带 ����
	@RequestMapping("/hello")
	public void main() { //�ν��Ͻ� �޼��� - iv,cv��� ��밡��
	//private�� ���: �۵��ȴ�. private:���� ��Ű�� url�� �޼��带 �����ߴٴ°� ���������� ������� �ܺο��� ȣ�Ⱑ���ϰ�
		//static�� �ȳ־ �Ǵ� ���� ��� ���� �ν��Ͻ��޼���(��ü���� �� ȣ�Ⱑ�� > url�� �������α׷��� ȣ���ϸ� ��Ĺ���� ��ü������ ���� (Reflection API)> �޼��� ȣ���)
		System.out.println("Hello");//�̰� ��Ĺ�ֿܼ� ����� ��
		System.out.println(cv);//ok
		System.out.println(iv);//ok
	}
	
	public static void main2() {//static�޼��� = cv�� ��밡��
		System.out.println(cv);//ok
//		System.out.println(iv);//����
		
	}
}
