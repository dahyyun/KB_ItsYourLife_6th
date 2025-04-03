<script>
import { ref, watch } from 'vue'

export default {
  name: 'Calc5',
  setup() {
    const x = ref(0) // 0으로 초기화

    const result = ref(0) // 0으로 초기화
    // 필요한 경우 코드 추가

    watch(x, (current, old) => {
      console.log(`${old}에서 ${current}로`)
      result.value = current
    })

    return { x, result }
  },
}
</script>

<template>
  <div>
    X : <input type="text" v-model.number="x" /> <br />
    결과 : {{ result }}
  </div>
</template>

<style scoped></style>
