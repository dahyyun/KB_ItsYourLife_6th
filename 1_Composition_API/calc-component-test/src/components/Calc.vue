<script>
import { ref } from 'vue'

export default {
  name: 'Calc',
  setup() {
    const x = ref(10) // 10으로 초기화
    const y = ref(20) // 20으로 초기화
    return { x, y }
  },
}
</script>

<template>
  <div>
    X : <input type="text" v-model.number="x" /><br />
    Y : <input type="text" v-model.number="y" /><br />
  </div>
</template>

<style scoped></style>
