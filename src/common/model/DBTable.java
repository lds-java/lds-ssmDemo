package common.model;

import java.io.Serializable;
import java.util.List;
/**
 * 数据库表信息模型
 * @author lds
 *
 * @param <T>
 */
public class DBTable<T> implements Serializable {

	private String tableName;
	private String entityName;
	private String tableTitle;
	private Class<T> tableEntityClass;
	private List<T> tableData;
	
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getTableTitle() {
		return tableTitle;
	}
	public void setTableTitle(String tableTitle) {
		this.tableTitle = tableTitle;
	}
	public Class<T> getTableEntityClass() {
		return tableEntityClass;
	}
	public void setTableEntityClass(Class<T> tableEntityClass) {
		this.tableEntityClass = tableEntityClass;
	}
	public List<T> getTableData() {
		return tableData;
	}
	public void setTableData(List<T> tableData) {
		this.tableData = tableData;
	}
	
	
}
