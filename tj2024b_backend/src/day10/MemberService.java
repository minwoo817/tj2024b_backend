package day10;

import java.util.Scanner;

public class MemberService {
	void join(Scanner scan, Member[] members) {
		System.out.println("아이디: "); String id = scan.next();
		System.out.println("비밀번호: "); String pw = scan.next();
		System.out.println("닉네임: "); String name = scan.next();
		Member member = new Member(id, pw, name);
		boolean save1 = false;
		for(int i = 0; i < members.length; i++) {
			if(members[i] == null) {
				members[i] = member;
				save1 = true;
				break;
			}
		}
		if(save1 == true) {System.out.println("회원가입완료");}
		else {System.out.println("회원가입 실패");}
	}
	void login(Scanner scan, Member[] members) {
		System.out.println("아이디: "); String id1 = scan.next();
		System.out.println("비밀번호: "); String pw1 = scan.next();
		boolean save2 = false;
		for(int i = 0; i < members.length; i++) {
			if(members[i] != null && members[i].getId().equals(id1) && members[i].getPw().equals(pw1)) {
				save2 = true;
				break;
			}
		}
		if(save2 == true) {System.out.println("로그인 성공");}
		else {System.out.println("로그인실패");}
	}
}
