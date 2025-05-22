package tw.shawn.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "member")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "account")
	private String account;
	
	@Column(name = "passwd")
	private String passwd;
	
	@Column(name = "cname")
	private String cname;
	
	//----------------
	@Column(name = "icon")
	private byte[] myicon;
	
	public byte[] getMyicon() {
		return myicon;
	}
	public void setMyicon(byte[] myicon) {
		this.myicon = myicon;
	}
	
	//----------------
	
	public Member() {}
	public Member(long id, String account, String passwd, String cname) {
		this.id = id;
		this.account = account;
		this.passwd = passwd;
		this.cname = cname;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	//---------------------------------------
	
	@OneToOne(mappedBy = "member", cascade = CascadeType.ALL)
	private MemberInfo memberInfo;	
	
	public MemberInfo getMemberInfo() {
		return memberInfo;
	}
	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
		memberInfo.setMember(this);
	}
	
	
}	