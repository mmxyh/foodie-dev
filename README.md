# 慕课网Java架构师体系
https://class.imooc.com/sc/73/learn

[天天吃货在线购物平台](http://shop.t.mukewang.com/)

# 目录结构
VO： 后端回参
BO： 前端传参

# 项目启动
- 修改配置：修改前端app.js的接口等地址, 修改后端项目application.yml的server.port端口
- 启动：tomcat运行前端项目, idea运行后端项目
- 浏览器访问http://localhost:8080/foodie-shop/
- 默认用户imooc, 密码123123（Qpf0SxOVUjUkWySXOZ16kw==）

# 

# swagger
[接口文档](http://localhost:8086/swagger-ui.html)
[接口文档Word](http://localhost:8086/doc.html)

# 内网穿透
- [natapp](https://natapp.cn/#download)
- 运行exe程序，执行cmd命令： natapp -authtoken=53e7b8360761fd2c


# 订单流程
- 创建订单，订单状态为 待付款
- 调用notifyMerchantOrderPaid（通知商家订单已支付）接口，订单状态改为 已付款，待发货
- 调用deliver（商家发货）接口，订单状态改为 已发货，待收货

