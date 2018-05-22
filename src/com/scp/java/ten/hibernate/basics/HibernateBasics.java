package com.scp.java.ten.hibernate.basics;

public class HibernateBasics {

}


/**
 * Boilerplate code -- code other than your business logic -- due to which
 * you can not directly focus on business logic
 * 
 * Developers responsibility to manage the connection/statement/resultset
 * 
 * 
 * RDBMS - 
 * 		Rows and columns
 * 
 * java Objects
 * 		-- Properties/memeber fields
 * 
 * 
 * Hiberante - ORM - Object relation mapping
 * 			-- Specify one time configuration
 * 				-- using xml
 * 				-- using Annotations 
 * <3 = xml is allowed
 * >=3 = xml + annotations
 * 
 * 
 * Database independent - 
 * 
 * HIbernate -- supports object oriented features
 * 				-- Inheritance
 * 				-- Mapping
 * 				-- Assocition
 * 						- Aggretion
 * 						- Composition
 * 						
 * 				-- Collecton properties
 * 
 * 
 * Object  -- HQL -- SQL
 * 
 * HQL  -- 
 * 
 * List --  
 * Set
 * Bag
 * 
 * 
 * --
 * 
 * Vid - Vnm
 * 1   maruti
 * 2   mahindra
 * 
 * mid mdelNm  vid
 * 1     Swift      1
 * 1     SwiftDesire      1
 * 1     Swift      1
 * 1     Swift      1
 * 
 * Criteria --
 * 
 *
 * 
 * driverclass
 * url -- ipaddress/machinename/hostname | port no -- database services | schema name
 * username
 * password
 * dialect -- datatypes mapping
 * 
 *
 * configuration  - --(hibernate.cfg.xml)
 * 			-- Database configuration
 				driverclass
 * 				url -- ipaddress/machinename/hostname | port no -- database services | schema name
 * 				username
 * 				password
 * dialect -- datatypes mapping
 * 
 * 
 * <hibernate-configuration>
 * 		<sessionfactory>
 * 				<property name="hibernate.url"></property>
 * 				<property name="hibernate.username"></property>
 * 				<property name="hibernate.password"></property>
 * 				<property name="hibernate.driverclass"></property>
 * 				<property name="hibernate.dialect" va></property>
 * 		</sessionfactory>
 * </hibernate-configuration>
 *  				 
 * mapping file (employee.mapping.xml)
 * 		---- mapping of entity class with table and entity fields with column
 *
 * <hibernate-mapping>
 * 		<class name="com.scp.Emp" table="employee_table>
 * 				<id name=empId  column="Emp_Id">
 * 				<property name="empName" column="Emp_name" type="java.lang.string"/>
 * 		</class>
 * </hibernate-mapping>
 * 
 * 
 * 
 * 
 * JDBC VS Hibernate
 * Hibernate configuration
 * 			<hibernate-configuration>
 * 					<sessionfactory>
 * 						url
 * 						username
 * 						driverclass
 * 						password
 * 						dialect
 * 					</sessionfactory>
 * 			<hibernate-configuration>
 * hibernate mapping
 * 				<hibernate-mapping>
 * 					<class name="Emp" table="Emp_table>
 * 							<id>
 * 							property
 * --name -- java class field
 * -- column -- database column name
 * 					</class>
 * 				</hibernate-mapping>
 * 
 * ACID + integrity
 * 
 * 
 * 
 * 
 */












