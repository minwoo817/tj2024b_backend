package day09;

import java.util.Scanner;

public class MemberService {
	void join(Scanner scan, Member[] members) {
		System.out.println("아이디 : "); String id = scan.next();
		System.out.println("비밀번호 : "); String pw = scan.next();
		System.out.println("닉네임 : "); String name = scan.next();
		Member member = new Member();
		member.id = id; member.pw = pw; member.name = name;
		boolean save = false;
		for(int i = 0; i <members.length; i++) {
			if(members[i] == null) {
				members[i] = member;
				save = true;
				break;
			}
		}
		if(save == true) {System.out.println("회원가입 완료");}
		else {System.out.println("회원가입 실패");}
	}
	
	
	void login(Scanner scan, Member[] members) {
		System.out.println("아이디: ");
		String id1 = scan.next();
		System.out.println("비밀번호: ");
		String pw1 = scan.next();
		boolean states = false;
		for(int i = 0; i <members.length; i++) {
			if(members[i] != null && members[i].id.equals(id1) && members[i].pw.equals(pw1)) {
				states = true;
				break;
			}
		}
		if(states == true) {System.out.println("로그인성공");}
		else {System.out.println("로그인실패");}
	}
}
