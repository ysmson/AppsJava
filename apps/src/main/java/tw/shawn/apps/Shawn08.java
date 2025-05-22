package tw.shawn.apps;

import tw.shawn.dao.MemberDao;
import tw.shawn.model.Member;
import tw.shawn.model.MemberInfo;

public class Shawn08 {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		Member member=memberDao.getById(14);
		System.out.println(member.getAccount());
		System.out.println("-----");
		if(member.getMemberInfo()==null) {
			System.out.println("no info");
			MemberInfo info = new MemberInfo();
			info.setBirthday("1999-02-03");
			info.setTel("456");
			info.setGender("male");
			member.setMemberInfo(info);
			memberDao.update(member);
			}else {
				System.out.println(member.getMemberInfo().getBirthday());
		}

	}

}
