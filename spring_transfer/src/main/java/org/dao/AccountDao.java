package org.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.domain.Account;

public interface AccountDao {
    @Select("select * from tbl_account where id = #{id} ")
    Account findById(Integer id);
    @Update("update tbl_account set money = money + #{money} where name = #{name}")
    void inmoney(@Param("name") String name,@Param("money") Double money);
    @Update("update tbl_account set money = money - #{money} where name = #{name}")
    void outmoney(@Param("name") String name,@Param("money") Double money);
}
