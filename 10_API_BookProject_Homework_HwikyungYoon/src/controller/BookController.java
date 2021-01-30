package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import model.vo.Book;

public class BookController {
	
	private Book[] list = new Book[5];
	{ // �ʱ�ȭ ���̶�� �ؼ� => list��� �迭�� ���õ����ͷ� 4���� ��ü�� �̸� ��Ƶ� �� ����
		list[0] = new Book("�ڹ��� ����", "���ӽ� ����", "����", new Date(2018-1900, 4-1, 15), 20000);
		list[1] = new Book("�����е� �����Ҳ�����", "������", "KH", new Date(2019-1900, 6-1, 15), 30000);
		list[2] = new Book("API�� ����", "������", "KH", new Date(2017-1900, 2-1, 13), 15000);
		list[3] = new Book("����� ���α׷���", "������", "���е���", new Date(2016-1900, 8-1, 30), 10000);
	}
	
	public BookController() {}
	
	// 1. ���� ��ü ��� ��� �޼ҵ�
	public void printAll() {
		
		// list �迭 ��ü ����ϴ� ���� �ۼ� 
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		
	}
	
	
	
	
	
	// 2. ���� �߰� ��� �޼ҵ�
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. �Ű������� ���޹��� newPrice��  ==>      String --> int�� ��ȯ �۾� (�Ľ� �ؾߵ�)
		int iPrice = Integer.parseInt(newPrice);
		
		
		// --------------------------------------------------------
		// 2. �Ű������� ���޹��� newDate��   ==>       String --> Date�� ��ȯ �۾�
		//	  '-'�� �����ڷ� StringTokenizer �Ǵ� split�� �̿��Ͽ� ���ڿ� �и� �� ���� ��,��,�� �� Date�� ����
		
		StringTokenizer stn = new StringTokenizer(newDate, "-");
		int year = Integer.parseInt(stn.nextToken());
		int month = Integer.parseInt(stn.nextToken());
		int day = Integer.parseInt(stn.nextToken());
		
		Date publishDate = new Date(year-1900, month-1, day);
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		
		
		// ------------------------------------------------------
		// 3. ������ ���޹��� ����� ������ ��ȯ�۾��� ���� price�� date���� ������
		//	  �Ű����� �����ڸ� ���� ������ �� 4�� �ε����� ����
		list[4] = new Book(newTitle, newAuthor, newPublisher, publishDate, iPrice);
		
	
	}
	
	
	// 3. ���� �Ⱓ�� ��� ��� �޼ҵ�
	public void printBookPublishDate() {
		
		// ������ ������ �Ⱓ�ϸ� ���
		// "xxxx�� xx�� xx�� �Ⱓ" �� ���� �������� ��� (SimpleDateFormat�̿�)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(list[4].getPublishDate()) + "�Ⱓ");
		
		
		
	}
	
	
	// 4. ���� �˻� ��� �޼ҵ�
	public void searchBook(String searchTitle) {
		
		// ���� ����Ʈ�� ��ü������ ��ȸ�ϸ鼭 (for�� �̿�)
		// ���޹��� �˻�� "����"��!! ������ ��� ���(���ڿ�.contains(���ڿ�)) 
		
		for(int i =0; i<list.length; i++) {
			
			int count = 0 ;
			if(list[i].getTitle().contains(searchTitle)) {
				System.out.println(list[i]);
				count += 1;
			}
			
		}
		
	
		
	}
	
	
	

}
