def call(String jobName, String projectRepo) {
  job(jobName) {
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
