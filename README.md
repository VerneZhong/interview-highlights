# 🎯 Interview Highlights - Java 后端面试知识集锦

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-8%2B-red.svg)](https://www.oracle.com/java/)
[![Status](https://img.shields.io/badge/Status-Active-brightgreen.svg)](#)

## 📌 项目简介

这是一个全面的 **Java 后端面试知识点集锦项目**，整理了从基础到高级的Java开发者必须掌握的核心知识点。无论你是准备面试还是系统复习，这个项目都能为你提供完整的学习路径。

### 🎓 项目特点

- ✅ 系统化的知识体系：从基础到高级，循序渐进
- ✅ 深度解析：每个知识点都有详细的解释和代码示例
- ✅ 面试真题：包含真实面试中常见的问题
- ✅ 代码实践：理论与实践相结合
- ✅ 持续更新：定期补充新的技术点和面试题

---

## 📚 知识体系结构

### 🔷 Java 基础
- **数据类型与变量**
  - 基本数据类型
  - 引用数据类型
  - 自动装箱拆箱
  - String 常见问题

- **面向对象编程**
  - 类与对象
  - 继承与多态
  - 接口与抽象类
  - 访问控制符

- **异常处理**
  - 异常体系
  - try-catch-finally
  - 自定义异常
  - 异常处理最佳实践

### 🔶 Java 集合与泛型
- List 相关：ArrayList、LinkedList、Vector
- Set 相关：HashSet、TreeSet、LinkedHashSet
- Map 相关：HashMap、TreeMap、LinkedHashMap、ConcurrentHashMap
- 集合源码分析
- 泛型机制与类型擦除

### 🟠 Java 多线程与并发
- **线程基础**
  - 线程创建方式
  - 线程生命周期
  - 线程状态转换
  - sleep vs wait 区别

- **同步与锁机制**
  - synchronized 关键字
  - volatile 关键字
  - Happens-before 原则
  - Lock 接口
  - ReentrantLock

- **线程池与并发工具**
  - ThreadPoolExecutor
  - Executor 框架
  - CountDownLatch、CyclicBarrier
  - Semaphore、Mutex

- **并发容器**
  - ConcurrentHashMap
  - CopyOnWriteArrayList
  - BlockingQueue

- **高级主题**
  - CAS 与原子操作
  - AQS 框架
  - Fork/Join 框架

### 🟡 JVM 虚拟机
- **内存模型**
  - 堆、栈、方法区
  - 运行时常量池
  - 字符串常量池

- **垃圾回收**
  - GC 算法
  - GC 收集器
  - 年轻代与老年代
  - Full GC 触发条件

- **性能优化**
  - JVM 参数调优
  - 内存泄漏排查
  - 性能分析工具

### 🟢 Spring 框架
- **Spring Core**
  - IoC 容器
  - Bean 生命周期
  - 依赖注入
  - AOP 原理

- **Spring MVC**
  - 请求处理流程
  - 参数绑定
  - 拦截器
  - 异常处理

- **Spring Data**
  - JPA 基础
  - 事务管理
  - 声明式事务

### 🔵 数据库
- **SQL 优化**
  - 索引设计
  - 查询优化
  - 执行计划分析
  - JOIN 优化

- **事务隔离**
  - ACID 特性
  - 隔离级别
  - 脏读、幻读、不可重复读

- **数据库设计**
  - 范式设计
  - 反范式设计
  - ER 模型

### 🟣 分布式系统
- **分布式理论**
  - CAP 理论
  - BASE 理论
  - 一致性算法

- **微服务架构**
  - 服务拆分
  - 服务通信
  - 服务治理

- **消息队列**
  - 消息可靠性
  - 消息顺序性
  - 幂等性设计

---

## 🚀 快速开始

### 前置要求
- JDK 8 或以上
- Maven 或 Gradle
- IDE（IntelliJ IDEA、Eclipse 等）

### 克隆项目

\`\`\`bash
git clone https://github.com/VerneZhong/interview-highlights.git
cd interview-highlights
\`\`\`

### 项目结构

\`\`\`
interview-highlights/
├── java-basics/              # Java 基础
│   ├── data-types/
│   ├── oop/
│   └── exception-handling/
├── collections/              # 集合与泛型
│   ├── list/
│   ├── set/
│   └── map/
├── concurrency/              # 多线程与并发
│   ├── thread-basics/
│   ├── synchronization/
│   ├── thread-pool/
│   └── concurrent-container/
├── jvm/                      # JVM 虚拟机
│   ├── memory-model/
│   ├── garbage-collection/
│   └── performance-tuning/
├── spring/                   # Spring 框架
│   ├── spring-core/
│   ├── spring-mvc/
│   └── spring-data/
├── database/                 # 数据库
│   ├── sql-optimization/
│   ├── transaction/
│   └── design/
├── distributed-system/       # 分布式系统
│   ├── distributed-theory/
│   ├── microservices/
│   └── message-queue/
└── README.md
\`\`\`

---

## 📖 使用方式

### 1️⃣ 按体系学习

推荐按照上述知识体系结构顺序学习，从基础到高级，逐步深入。

### 2️⃣ 按需查找

根据面试需要，快速查找相关知识点和代码示例。

### 3️⃣ 动手实践

- 运行代码示例
- 修改参数观察结果
- 编写自己的测试用例

---

## 💡 核心知识点速查

### Java 基础
- [String 的 intern 方法](java-basics/string-intern)
- [equals 和 == 的区别](java-basics/equals-vs-equals-sign)
- [try-catch-finally 执行顺序](java-basics/try-catch-finally)

### 集合
- [HashMap 源码分析](collections/map/hashmap-analysis)
- [ConcurrentHashMap 实现](collections/map/concurrenthashmap)
- [ArrayList vs LinkedList](collections/list/arraylist-vs-linkedlist)

### 并发
- [synchronized vs volatile](concurrency/synchronization/synchronized-vs-volatile)
- [线程池参数优化](concurrency/thread-pool/threadpool-tuning)
- [CAS 原理](concurrency/cas-principle)

### JVM
- [内存溢出 vs 栈溢出](jvm/oom-vs-stackoverflow)
- [Full GC 触发条件](jvm/garbage-collection/full-gc-trigger)
- [JVM 参数配置](jvm/performance-tuning/jvm-params)

---

## 🎯 面试题集合

### Java 基础高频题

**Q: String、StringBuffer、StringBuilder 的区别？**

A: 
- String：不可变，每次修改都创建新对象
- StringBuffer：可变，线程安全，性能较低
- StringBuilder：可变，非线程安全，性能高

**Q: Integer.valueOf(127) == Integer.valueOf(127) 的结果是什么？**

A: true（因为 Integer 缓存了 -128 到 127 的值）

### 多线程高频题

**Q: sleep 和 wait 的区别？**

A:
- sleep：线程休眠，不释放锁，时间到自动唤醒
- wait：线程等待，释放锁，需要 notify 唤醒

**Q: 线程池的拒绝策略有哪些？**

A: AbortPolicy、CallerRunsPolicy、DiscardPolicy、DiscardOldestPolicy

### Spring 高频题

**Q: Spring Bean 的生命周期？**

A: 实例化 → 属性赋值 → 初始化前 → 初始化 → 初始化后 → 使用 → 销毁

**Q: Spring 的事务是如何实现的？**

A: 通过 AOP 代理，在方法前开启事务，方法后提交或回滚

---

## 🔥 高频面试总结

### Top 10 Java 面试题

1. HashMap 为什么线程不安全？如何解决？
2. 什么时候会发生 Full GC？如何优化？
3. volatile 关键字的作用？
4. 如何设计一个线程池？
5. Spring Bean 默认是单例吗？单例的坑？
6. MySQL 的三大范式是什么？
7. Redis 缓存穿透、击穿、雪崩如何解决？
8. 如何实现分布式事务？
9. 消息队列的消费幂等性如何保证？
10. 如何排查 OOM 问题？

---

## 💻 代码示例

项目包含大量实践代码示例，涵盖：

- ✅ 线程安全的集合实现
- ✅ 线程池的正确使用方式
- ✅ JVM 调优案例
- ✅ Spring 源码分析
- ✅ 常见问题复现与解决方案

---

## 📊 学习进度追踪

建议按照以下优先级学习：

### 第一阶段：基础（1-2 周）
- Java 基础
- 面向对象
- 异常处理

### 第二阶段：进阶（2-3 周）
- 集合与泛型
- 多线程基础
- 简单 JVM

### 第三阶段：高级（3-4 周）
- 并发工具
- JVM 优化
- Spring 框架

### 第四阶段：专家（4+ 周）
- 数据库优化
- 分布式系统
- 架构设计

---

## 🤝 贡献指南

欢迎提交 PR 和 Issue！

### 贡献步骤

1. Fork 本仓库
2. 创建特性分支 (`git checkout -b feature/amazing-feature`)
3. 提交更改 (`git commit -m 'Add amazing feature'`)
4. 推送到分支 (`git push origin feature/amazing-feature`)
5. 开启 Pull Request

### 贡献内容类型

- 📝 新增知识点
- 🐛 修复错误
- 💡 改进示例代码
- 🎯 添加新的面试题
- 📚 完善文档

---

## 📝 更新日志

### v1.0.0 (2024-Q1)
- ✅ 完成 Java 基础知识点整理
- ✅ 添加多线程与并发详细讲解
- ✅ 包含 Spring 框架核心内容
- ✅ 提供数据库优化指南

---

## 📞 联系方式

- 📧 Email: vernez@example.com
- 💬 微信: [个人微信二维码]
- 🐙 GitHub: [@VerneZhong](https://github.com/VerneZhong)

---

## 📄 许可证

MIT License - 详见 [LICENSE](LICENSE) 文件

---

## ⭐ 致谢

感谢所有贡献者和支持者！如果这个项目对你有帮助，请给个 Star ⭐

---

**最后更新**: 2026-03-30  
**维护者**: [@VerneZhong](https://github.com/VerneZhong)
