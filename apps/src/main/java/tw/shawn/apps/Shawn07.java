package tw.shawn.apps;

import java.io.FileInputStream;

import tw.shawn.apis.BCrypt;
import tw.shawn.dao.MemberDao;
import tw.shawn.model.Member;
import tw.shawn.model.MemberInfo;

public class Shawn07 {
	public static void main(String[] args) {

		MemberDao memberDao = new MemberDao();
		
		Member member = new Member();
		member.setAccount("newda");
		member.setPasswd(BCrypt.hashpw("123456", BCrypt.gensalt()));
		member.setCname("Newda");
		//---------
		try {
			FileInputStream fin = new FileInputStream("dir1/Doraemon.jpg");
			byte[] da = fin.readAllBytes();
			member.setMyicon(da);
		}catch(Exception e) {
			System.out.println(e);
		}
		//---------
		
		MemberInfo info = new MemberInfo();
		info.setBirthday("1999-02-03");
		info.setTel("456");
		info.setGender("male");
		
		member.setMemberInfo(info);
		
		memberDao.save(member);
		
		
		
	}
}