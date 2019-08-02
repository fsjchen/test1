package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//生成get/set方法,必要的构造方法,tostring,hashCode等
@Data
@NoArgsConstructor//生成无参构造
@AllArgsConstructor//生成全参构造
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}
