#
# To learn more about a Podspec see http://guides.cocoapods.org/syntax/podspec.html
#
Pod::Spec.new do |s|
  s.name             = 'amap_base_flutter'
  s.version          = '0.0.1'
  s.summary          = 'A new fluttify plugin.'
  s.description      = <<-DESC
A new flutter plugin project.
                       DESC
  s.homepage         = ''
  s.license          = { :file => '../LICENSE' }
  s.author           = { '' => '' }
  s.source           = { :path => '.' }
  s.source_files = 'Classes/**/*'
  s.public_header_files = 'Classes/**/*.h'
  s.dependency 'Flutter'
  s.dependency 'foundation_fluttify'
  # flutter插件依赖
  

  s.ios.deployment_target = '8.0'
  # 包含工程下的framework
  s.vendored_frameworks = '**/*.framework'
  # 包含工程下的.a
  s.vendored_libraries = '**/*.a'
  # 默认使用静态framework
  s.static_framework = true
  # 系统framework
  s.frameworks = [
        "QuartzCore", "CoreLocation", "SystemConfiguration", "CoreTelephony", "Security", "OpenGLES", "CoreText", "CoreGraphics", "GLKit"
  ]
  # 系统library
  s.libraries = [
        "z", "c++"
  ]
  # 需要添加的资源文件
  s.resources = '*.framework/*.bundle'
end

