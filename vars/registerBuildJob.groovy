def call(String jobName, String projectRepo) {
  freeStyleJob(jobName) {
    scm {
      git {
        branch('master')
        remote {
          url(projectRepo)
        }
      }
    }
    steps {
      maven {
        goals('clean verify')
      }
    }
  }
}
