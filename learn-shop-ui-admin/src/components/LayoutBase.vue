<template>
  <div class="wrapper">
    <v-head></v-head>
    <v-sidebar :routes="routes"></v-sidebar>
    <div class="head-top">
      <head-top></head-top>
    </div>
    <!--  右侧内容显示区  -->
    <div class="content">
      <transition mode="out-in" name="move">
        <keep-alive>
          <router-view v-if="$route.meta.keepAlive"></router-view>
        </keep-alive>
      </transition>
      <transition mode="out-in" name="move">
        <router-view v-if="!$route.meta.keepAlive"></router-view>
      </transition>
    </div>
  </div>
</template>

<script>
import vHead from './header/Header.vue'
import vSidebar from './navmenu/Sidebar.vue'
import HeadTop from './header/HeadTop.vue';
import {defaultRouterMap} from '../router'

export default {
  components: {
    vHead, vSidebar, HeadTop
  },
  computed: {
    routes() {
      return defaultRouterMap
    }
  }
}
</script>
<style scoped>
/*定义滚动条高宽及背景 高宽分别对应横竖滚动条的尺寸*/
::-webkit-scrollbar {
  width: 3px; /*滚动条宽度*/
  height: 3px; /*滚动条高度*/
}

/*定义滚动条轨道 内阴影+圆角*/
::-webkit-scrollbar-track {
  -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, 0.3);
  border-radius: 10px; /*滚动条的背景区域的圆角*/
  background-color: white; /*滚动条的背景颜色*/
}

/*定义滑块 内阴影+圆角*/
::-webkit-scrollbar-thumb {
  border-radius: 10px; /*滚动条的圆角*/
  -webkit-box-shadow: inset 0 0 6px rgba(0, 0, 0, .3);
  background-color: #2E363F; /*滚动条的背景颜色*/
}
</style>
