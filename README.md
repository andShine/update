# Update [![](https://jitpack.io/v/andShine/update.svg)](https://jitpack.io/#andShine/update)
## 清晰灵活简单易用的android应用更新库

改自 [https://github.com/czy1121/update](https://github.com/czy1121/update)

#### 不同的地方 ####
1. 跳过md5验证
2. 待更新...

## 使用步骤 ##
#### Step 1. Add the JitPack repository to your build file ####
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
#### Step 2. Add the dependency ####
    dependencies {
	        compile 'com.github.andShine:update:1.2.1'
	}
