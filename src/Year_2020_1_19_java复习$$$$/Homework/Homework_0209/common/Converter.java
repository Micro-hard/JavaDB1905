package Year_2020_1_19_java复习$$$$.Homework.Homework_0209.common;

import java.sql.ResultSet;
import java.sql.SQLException;

//转换接口，dao实现类在调用JdbcTools的查询方法时传递此此接口实例
public interface Converter<T> {//传的泛型是什么就转换成什么vo对象
    public T convert(ResultSet rs) throws SQLException;
}
