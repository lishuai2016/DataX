package com.alibaba.datax.common.element;

/**
 * Created by jingxing on 14-8-24.
 */

public interface Record {//Record中可以放多个Column对象，这可以简单理解为数据库中的记录和列

	public void addColumn(Column column);

	public void setColumn(int i, final Column column);

	public Column getColumn(int i);

	public String toString();

	public int getColumnNumber();

	public int getByteSize();

	public int getMemorySize();

}
