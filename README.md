# [首页查询更多项目](https://github.com/GraduationProject-ssm) 包安装运行


# 11149ssm艺诚美业管理系统

![picture](https://raw.githubusercontent.com/GraduationProject-springboot/.github/main/img/wx.png)

### 点击播放视频 ▼
[![Watch the video](https://i.sstatic.net/Vp2cE.png)](https://www.bilibili.com/video/BV1Kp48e9EtU?p=39)


# 系统概述
进过系统的分析后，就开始记性系统的设计，系统设计包含总体设计和详细设计。总体设计只是一个大体的设计，经过了总体设计，我们能够划分出系统的一些东西，例如文件、文档、数据等。而且我们通过总体设计，大致可以划分出了程序的模块，以及功能。但是只是一个初步的分类，并没有真正的实现。

整体设计，只是一个初步设计，而且，对于一个项目，我们可以进行多个整体设计，通过对比，包括性能的对比、成本的对比、效益的对比，来最终确定一个最优的设计方案，选择优秀的整体设计可以降低开发成本，增加公司效益，从这一点来讲，整体设计还是非常重要的。

艺诚美业管理系统工作原理图如图4-1所示：

![](/md/blog.012.png)

图4-1 系统工作原理图
## 4.2 系统结构设计
系统架构图属于系统设计阶段，系统架构图只是这个阶段一个产物，系统的总体架构决定了整个系统的模式，是系统的基础。艺诚美业管理系统的整体结构设计如图4-2所示。

![](/md/blog.013.png)

图4-2 系统结构图
## 4.3数据库设计
数据库是计算机信息系统的基础。目前，电脑系统的关键与核心部分就是数据库。数据库开发的优劣对整个系统的质量和速度有着直接影响。
### 4.3.1 数据库设计原则
数据库的概念结构设计采用实体—联系（E-R）模型设计方法。E-R模型法的组成元素有：实体、属性、联系，E-R模型用E-R图表示，是提示用户工作环境中所涉及的事物，属性则是对实体特性的描述。在系统设计当中数据库起着决定性的因素。下面设计出这几个关键实体的实体—关系图。
### 4.3.2 数据库实体
数据模型中的实体（Entity），也称为实例，对应现实世界中可区别于其他对象的“事件”或“事物”。例如，公司中的每个员工，家里中的每个家具。

本系统的E-R图如下图所示：

1、员工打卡管理实体图如图4-3所示：

![](/md/blog.014.png)

图4-3员工打卡管理实体图

2、技师预约管理实体图如图4-4所示：

![](/md/blog.015.png)

`     `图4-4技师预约管理实体图

3、员工管理实体图如图4-5所示：

![](/md/blog.016.png)

`     `图4-5员工管理实体图

#########

### 4.3.3 数据库表设计
数据库的表信息属于设计的一部分，下面介绍数据库中的各个表的详细信息。

表4-1 allusers表

|列名|数据类型|长度|约束|
| :-: | :-: | - | :-: |
|id|int|11|NOT NULL|
|username|varchar|50|` `default NULL|
|pwd|varchar|50|` `default NULL|
|cx|varchar|50|` `default NULL|

表4-2 faxingmeirongshi表

|列名|数据类型|长度|约束|
| :-: | :-: | - | :-: |
|id|int|11|NOT NULL|
|addtime|varchar|50|default NULL|
|jishileixing|varchar|50|default NULL|
|jishixingming|varchar|50|default NULL|
|zhiweimingcheng|varchar|50|default NULL|
|congyeshijian|varchar|50|default NULL|
|jianjie|varchar|50|default NULL|
|zhaopian|varchar|50|default NULL|

表4-3：huiyuan表

|列名|数据类型|长度|约束|
| :-: | :-: | :-: | :-: |
|id|` `int|11|NOT NULL |
|addtime|varchar|50|default NULL|
|zhanghao|varchar|50|default NULL|
|mima|varchar|50|default NULL|
|xingming|varchar|50|default NULL|
|xingbie|varchar|50|default NULL|
|shouji|varchar|50|default NULL|
|youxiang|varchar|50|default NULL|
|zhaopian|varchar|50|default NULL|

表4-4 huiyuanchongzhi表

|列名|数据类型|长度|约束|
| :-: | :-: | - | :-: |
|id|int|11|NOT NULL|
|addtime|varchar|50|default NULL|
|zhanghao|varchar|50|default NULL|
|xingming|varchar|50|default NULL|
|chongzhijine|varchar|50|default NULL|
|chongzhishijian|varchar|50|default NULL|
|zhanghuyue|varchar|50|default NULL|

`   `表4-5 jishiyuyue表

|列名|数据类型|长度|约束|
| :-: | :-: | - | :-: |
|id|int|11|NOT NULL|
|addtime|varchar|50|default NULL|
|jishileixing|varchar|50|default NULL|
|jishixingming|varchar|50|default NULL|
|zhiweimingcheng|varchar|50|default NULL|
|yuyueshijian|varchar|50|default NULL|
|zhanghao|varchar|50|default NULL|
|xingming|varchar|50|default NULL|
|shouji|varchar|50|default NULL|




# 5统详细设计
## 5.1前台首页功能模块
艺诚美业管理系统，在系统首页可以查看首页、发型美容师、套餐信息、我的、跳转到后台等内容，如图5-1所示。

![](/md/blog.017.png)

图5-1前台首页功能界面图



员工登录、员工注册，在注册页面可以填写工号、姓名、密码、职位名称、技师类型、手机、邮箱等信息进行注册、登录，如图5-2所

示。

![](/md/blog.018.png)

![](/md/blog.019.png)

图5-2员工注册、员工登录界面图
#########
个人中心，在个人中心页面通过填写工号、姓名、职位名称、技师类型、性别、手机、邮箱、照片等信息进行更新信息、退出登录，如图5-3所示。在套餐信息页面通过填写套餐类型、套餐名称、套餐详情、套餐价格、套餐照片等信息进行购买操作，如图5-4所示。

![](/md/blog.020.png)

图5-3个人中心界面图
#########
![](/md/blog.021.png)

图5-4套餐信息界面图

## 5.2管理员功能模块
管理员登录，通过填写用户名、密码进行登录，如图5-5所示。

![](/md/blog.022.png)

图5-5管理员登录界面图

管理员登录进入艺诚美业管理系统可以查看个人中心、会员管理、员工管理、员工打卡管理、技师预约管理、发型美容师管理、技师类型管理、套餐信息管理、套餐类型管理、套餐购买管理、会员充值管理、系统管理等信息。

员工管理，在员工管理页面中可以通过填写工号、姓名、职位名称、技师类型、性别、手机、邮箱、照片等内容进行详情、修改、删除，如图5-6所示。还可以根据需要对员工打卡管理进行详情，修改等详细操作，如图5-7所示。

![](/md/blog.023.png)

图5-6员工管理界面图

![](/md/blog.024.png)

图5-7员工打卡管理界面图

技师预约管理，在技师预约管理页面中可以查看技师类型、技师姓名、职位名称、预约时间、账号、姓名、手机等信息，并可根据需要对已有技师预约管理进行修改或删除等操作，如图5-8所示。

![](/md/blog.025.png)

图5-8技师预约管理界面图

技师类型管理，在技师类型管理页面中可以查看技师类型等信息，并可根据需要对已有技师类型管理进行修改或删除等详细操作，如图5-9所示。

![](/md/blog.026.png)

图5-9技师类型管理界面图

套餐信息管理，在套餐信息管理页面中可以查看套餐类型、套餐名称、套餐详情、套餐价格、套餐照片等内容，并且根据需要对已有套餐信息管理进行详情，修改或删除等详细操作，如图5-10所示。

![](/md/blog.027.png)

图5-10套餐信息管理界面图

套餐购买管理，在套餐购买管理页面中可以查看套餐类型、套餐名称、套餐价格、购买数量、总金额、购买时间、账号、姓名、手机、是否支付等内容，并且根据需要对已有套餐购买管理进行详情，修改或删除等详细操作，如图5-11所示。

![](/md/blog.028.png)

图5-11套餐购买管理界面图


## 5.3会员功能模块
会员登录进入艺诚美业管理系统可以查看个人中心、技师预约管理、套餐购买管理、会员充值管理等内容。

套餐购买管理，在套餐购买管理页面中通过查看套餐类型、套餐名称、套餐价格、购买数量、总金额、购买时间、账号、姓名、手机、是否支付等信息，还可以根据需要对套餐购买管理进行修改，如图5-12所示。

![](/md/blog.029.png)

图5-12套餐购买管理界面图

技师预约管理，在技师预约管理页面中可以查看技师类型、技师姓名、职位名称、预约时间、账号、姓名、手机等信息，并且根据需要对已有技师预约管理进行查看删除等其他详细操作，如图5-13所示。

![](/md/blog.030.png)

图5-13技师预约管理界面图
#########
## 5.4员工功能模块
员工登录进入艺诚美业管理系统可以查看个人中心、员工打卡管理、技师预约管理等内容。

员工打卡管理，在员工打卡管理页面中通过查看工号、姓名、考勤类型、打卡时间、地址等信息，还可以根据需要对员工打卡管理进行修改，如图5-14所示。

![](/md/blog.031.png)

图5-14员工打卡管理界面图













