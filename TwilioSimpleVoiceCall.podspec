require 'json'

spec = JSON.load(File.read(File.expand_path("./package.json", __dir__)))

Pod::Spec.new do |s|
  s.name         = "TwilioSimpleVoiceCall"
  s.version      = spec['version']
  s.summary      = spec['description']
  s.authors      = spec['author']['name']
  s.homepage     = spec['homepage']
  s.license      = spec['license']
  s.platform     = :ios, "10.0"

  s.source_files = [ "ios/TwilioSimpleVoiceCall/*.h", "ios/TwilioSimpleVoiceCall/*.m"]
  s.source = {:path => "./TwilioSimpleVoiceCall"}

  s.dependency 'React'
  s.xcconfig = { 'FRAMEWORK_SEARCH_PATHS' => '${PODS_ROOT}/TwilioVoice' }
  s.frameworks   = 'TwilioVoice'
end
