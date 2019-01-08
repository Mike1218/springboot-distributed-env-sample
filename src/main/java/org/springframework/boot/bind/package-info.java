package org.springframework.boot.bind;

//该包用于解决sharding-jdbc和spring版本不一致问题。i
// io.shardingjdbc.spring.boot.SpringBootConfiguration第49行的RelaxedPropertyResolver所在包已经被spring删除
// spring做法是Environment直接继承RelaxedPropertyResolver，可以直接用Environment对象调用getProperty，无需再new一个对象。
// 这里给出该package的原因是为了优雅的使用sharding-jdbc，待sharding-jdbc升级改掉该issue后删去该package即可