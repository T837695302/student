package com.product.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.product.bean.Product;

/**
 * ProductMapper数据库映射
 * @ClassName ProductMapper
 */

public class ProductMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setId(rs.getInt("id"));
		product.setProductname(rs.getString("productname"));
		product.setSupplier(rs.getString("supplier"));
		product.setType(rs.getString("type"));
		product.setIndate(dateToString(rs.getDate("indate")));
		product.setPrice(rs.getInt("price"));
		product.setAmount(rs.getInt("amount"));
		return product;
	}

	/**
	 * 日付から、文字列に変換する。
	 *
	 * @param date 日付.
	 * @return 文字列.
	 */
	private String dateToString(Date date) {

		String dateStr = null;
		if (date != null) {
			dateStr = new SimpleDateFormat("yyyy/MM/dd").format(date);
		} else {
			dateStr = "";
		}
		return dateStr;
	}
}

