# HashMap总结

1、HashMap是线程不安全的(HashMap是异步的，HashTable是同步的)
 2、HashMap采用了数组和链表的数据结构，能在查询和修改方便继承了数组的线性查找和链表的寻址修改
 2、HashMap是一个散列桶(数组和链表)，以键值对方式进行存储的
 3、HashMap是通过get()和put()方法来获取和存储对象的。当我们存储值时，将键值对传给put()方法时，他调用键的hashCode()方法来计算hashCode值，然后找到对应的bucket位置来存储对象。当获取对象时，通过调用键的equals()方法找到正确的键值对，来返回值对象
 4、HashMap通过链表的方式解决hash碰撞的，当发生碰撞时，对象会存储在链表的下一个节点中。

hashMap实现了Map接口，继承了AbstractMap类。其中Map接口定义了键映射到值的规则，AbstractMap类提供了Map接口的骨干实现。

数组存储区间是连续的，占用内存严重，故空间复杂的很大。但数组的二分查找时间复杂度小，为O(1)；
数组的特点是：寻址容易，插入和删除困难；
链表存储区间离散，占用内存比较宽松，故空间复杂度很小，但时间复杂度很大，为O（N）。
链表的特点是：寻址困难，插入和删除容易。
综合这两者的优点，摒弃缺点，哈希表就诞生了，既满足了数据查找方面的特点，占用的空间也不大。
哈希表可以说就是数组链表，底层还是数组但是这个数组每一项就是一个链表。
hashMap底层是基于数组链表实现的。Java8之后添加了红黑树的概念
hashMap底层有一个entry数组(entry是hashMap的内部类，它包含了键key、值value、下一个节点next，以及hash值，这是非常重要的，
正是由于Entry才构成了table数组的项为链表)，数组上每一项都有一个链表，
如果链表长度超过阀值( TREEIFY THRESHOLD==8)，就把链表转成红黑树，链表长度低于6，就把红黑树转回链表