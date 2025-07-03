<!-- <script setup>은 Vue3에서 Composition API를 더 간단하게 쓸 수 있게 해주는 문법 -->
<script setup>
// RouterView는 vue-router에서 제공하는 컴포넌트
// 현재 URL 경로에 따라 맞는 컴포넌트를 화면에 보여줌
import { RouterLink, RouterView } from 'vue-router'
</script>

<!-- 화면에 보여줄 HTML 구조 정의하는 부분 -->
<template>
  <!-- RouterView는 라우터 설정에 따라 해당 컴포넌트를 이 위치에 표시함 -->
  <RouterView />
</template>

<!-- scoped는 이 CSS가 이 컴포넌트에만 적용되게 제한 -->
<!-- scoped가 없으면 다른 컴포넌트를 합했을 때 모두 영향을 미치게 됨. -> 전역 설정 -->
<style scoped>
header {
  line-height: 1.5;
  max-height: 100vh;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

nav {
  width: 100%;
  font-size: 12px;
  text-align: center;
  margin-top: 2rem;
}

nav a.router-link-exact-active {
  color: var(--color-text);
}

nav a.router-link-exact-active:hover {
  background-color: transparent;
}

nav a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid var(--color-border);
}

nav a:first-of-type {
  border: 0;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }

  nav {
    text-align: left;
    margin-left: -1rem;
    font-size: 1rem;

    padding: 1rem 0;
    margin-top: 1rem;
  }
}
</style>
