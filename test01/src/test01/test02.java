package test01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test02 {

	public static void main(String[] args) throws IOException {
		List<dept> list = test02.getData();//��ȡ�����е�����
		List<dept> depts= new ArrayList<>();
		List<List<dept>> list2 =new ArrayList<>();
		Map<Integer,dept> map = new HashMap<>();
		for(dept d : list) {
			map.put(d.getId(), d);
		}
		/**
		 * ֻ����һ�����ģ�������Ӧ������������
		 */
		for(dept d : list){
			dept child=d;
			if(child.getPid() == 0) {//��һ���˵��ŵ���������
				depts.add(d);
			}else {
				dept dep = map.get(child.getPid());
				dep.getList().add(child);
			}
		}
		
		for (List<dept> dept : list2) {
				System.out.println(dept.toString());
		}
		
	}
	
	public static List<dept> getData(){
		List<dept> list = new ArrayList<>();
		list.add(new dept(1,"���ڵ�1",0));
		list.add(new dept(2,"���ڵ�2",1));
		list.add(new dept(3,"���ڵ�3",2));
		list.add(new dept(4,"���ڵ�4",1));
		list.add(new dept(5,"���ڵ�1-1",0));
		list.add(new dept(6,"���ڵ�1-2",0));
		return list;
	}

}

class dept{
	public List<dept> getList() {
		return list;
	}
	public void setList(List<dept> list) {
		this.list = list;
	}
	private Integer id;
	private String name;
	private Integer pid;
	private List<dept> list = new ArrayList<>();
	
	public dept(Integer id, String name, Integer pid ) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
	}
	
	public dept() {
		super();
	}
	public dept(Integer id, String name, Integer pid, List<dept> list) {
		super();
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.list = list;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "dept [id=" + id + ", name=" + name + ", pid=" + pid + ", list=" + list + "]";
	}
	
}
