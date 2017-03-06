package com.hsm.readermapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.hsm.model.Product;
/**
 * 根据csv文件中的字段集合构建Product对象
 * @author huangsm
 */
public class ProductFieldSetMapper implements FieldSetMapper<Product>{
	public Product mapFieldSet(FieldSet fieldSet) throws BindException {
		Product product=new Product();
        product.setId( fieldSet.readInt( "id" ) );
        product.setName( fieldSet.readString( "name" ) );
        product.setDescription( fieldSet.readString( "description" ) );
        product.setQuantity( fieldSet.readInt( "quantity" ) );
        return product;
	}
	
}
