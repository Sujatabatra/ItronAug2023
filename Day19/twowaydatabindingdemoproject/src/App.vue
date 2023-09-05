<template>
  <!-- <FormInput></FormInput>  -->
<!-- <EventComponent></EventComponent> -->
 <ConditionalComponent></ConditionalComponent>
 <hr>
 <LoopingComponent></LoopingComponent>
</template>

<script>
// import EventComponent from './components/EventComponent.vue';
// import FormInput from './components/FormInput.vue';
import ConditionalComponent from './components/ConditionalComponent.vue';
import LoopingComponent from './components/LoopingComponent.vue';
export default {
  name: 'App',
  components: {
    // EventComponent,
    // FormInput
    ConditionalComponent,
    LoopingComponent
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  /* text-align: center; */
  color: #2c3e50;
  margin-top: 60px;
}
</style>
