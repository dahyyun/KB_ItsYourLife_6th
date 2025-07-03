// 갤러리 관련 라우팅
export default [
  {
    path: '/gallery/list',
    name: 'galllery/list',
    component: () => import('../pages/gallery/GalleryListPage.vue'),
  },
]
