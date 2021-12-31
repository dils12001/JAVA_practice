package com.principle.stringTest;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("1");
		// �۷��G
//		1. �bheap��(�r�Ŧ�`�q���~)new �@��String() ��H
//		2. �bheap���r�Ŧ�`�q�����Anew �@��"1" ��H
//		3. ���(2��1)�As1�O�`�q���~�A���ӹ�H���a�}
		
		s1.intern();
//		�ݬ�s1��"��"�b�r�Ŧ�`�q�����O�_�s�b
//		�p�w�s�b�A�ȱ���^�Ӧa�}
//		�p���s�b�A���b�r�Ŧ�`�q�����Ыظӹ�H�A�A��^�Ӧa�}
//		����12��S���ܼƥh���a�}�A"1"�]�w�s�b�r�Ŧ�`�q�����A�G���ɵL��
		
		String s2 = "1";
		// s2���`�q������H���a�}
		
		System.out.println(s1 == s2);	// �a�}���@�ˡA�Gfalse
		
		
		String s3 = new String("1") + new String("1");
		// �۷��G
//		1. �]�A�Ψ�r�Ŧꪺ�����A�|��new�@�� StringBuilder��H
//		2. �bheap��(�r�Ŧ�`�q���~)new �@��String() ��H
//		3. �bheap���r�Ŧ�`�q�����Anew �@��"1" ��H
//		4. ��ȡA�e������String��H
//		5. �bheap��(�r�Ŧ�`�q���~)new �@��String() ��H
//		6. �bheap���r�Ŧ�`�q�����Anew �@��"1" ��H
//		7. ��ȡA�᭱����String��H
//		8. StringBuilder��H�i������A���|�ե� toString()��k
//		9. toString()��k �|�Anew�@��String��H�A�ý�Ȭ�11
//		�`�N�A�o�̦b�`�q�����èS���ͦ�"11"����H
		
		s3.intern();
//		�]���`�q�����S��"11"����H�A�쥻���ӭn�ͦ���
//		��jdk7��AIntern()��k�b�����p�U�A�����`�ͦ���
//		�ӬO�b�`�q�����ͦ�"11"���i�ޥΡj�A���V�~������"11"��H���a�}
//		�ϥ�String�Ofinal���A����A�Q���ܡA�N���t�~�ͦ��A�H�`�ٰ�Ŷ�
		
		String s4 = "11";
		// �]37�檺�ʧ@�As4���O���Vs3���a�}
		System.out.println(s3 == s4);	// true

	}

}
