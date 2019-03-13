package com.seu.scrm.Mapper;

import com.seu.scrm.Entity.Orders;
import com.seu.scrm.Entity.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HotGoodsMapper {

        @Select("SELECT  cate,brand,asin,title,imUrl,price,num from orders,product where orders.prod_asin=product.asin " +
                "group by prod_asin order by sum(num) desc limit 3")
        List<Product> select();

    @Select(" select * from customer where open_id =#{open_id}")
        Orders selectById(@Param("open_id") String open_id);

    @Select("select * from product where asin in (SELECT prod_asin from personal_recom WHERE " +
            "personal_recom.user_id = (SELECT user_id from customer where open_id= #{open_id}))")
         List<Product> select1(@Param("open_id") String open_id);
}