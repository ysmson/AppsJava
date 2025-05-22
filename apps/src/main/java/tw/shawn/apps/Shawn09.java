package tw.shawn.apps;

import java.util.List;

import tw.shawn.dao.MemberDao;
import tw.shawn.model.Member;

public class Shawn09 {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		List<Member> members = memberDao.findByTel("0912");
		if (members != null) {
			for (Member member: members) {
				System.out.println(
						member.getId() + " : " + 
						member.getAccount() + " : " +
						member.getMemberInfo().getTel());
			}
		}else {
			System.out.println("NOT FOUND");
		}
	}

}